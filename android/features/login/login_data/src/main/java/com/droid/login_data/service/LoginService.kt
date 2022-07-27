package com.droid.login_data.service

import com.droid.login_domain.usecases.entities.inputs.LoginInput
import com.iprayforgod.core.modules.firebase.repository.FirebaseAuthRepository
import com.iprayforgod.core.modules.keys.KeysFeatureNames
import com.iprayforgod.core.modules.logger.repository.LoggerRepository
import com.iprayforgod.core.platform.functional.State
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LoginService @Inject constructor(
    private val service: FirebaseAuthRepository,
    private var  log: LoggerRepository
) {

    fun loginUser(input: LoginInput): Flow<State<Boolean>> {

        val resultDeferred = CompletableDeferred<State<Boolean>>()

        try {
            val result = service.getFirebaseAuth()
                .signInWithEmailAndPassword(input.email, input.password)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        resultDeferred.complete(State.success(true))
                    } else {
                        resultDeferred.complete(State.failed(it.exception?.message.toString()))
                    }
                }
        } catch (ex : Exception) {
            resultDeferred.completeExceptionally(ex)
        }

        return flow {
            try {
                emit(State.loading())
                emit(resultDeferred.await())
            } catch (e: Exception) {
                log.e(KeysFeatureNames.FEATURE_LOGIN, e.stackTrace.toString())
                resultDeferred.completeExceptionally(e)
            }
        }

    }

}