package com.droid.core_mock.features.common.common_domain.repository

import com.iprayforgod.common_domain.repository.CommonRepository
import com.iprayforgod.core.domain.models.User
import com.iprayforgod.core.platform.functional.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeSuccessCommonRepository : CommonRepository {
    override fun saveUser(input: User): Flow<State<Unit>> {
        return flow { emit(State.success(Unit)) }
    }
}
