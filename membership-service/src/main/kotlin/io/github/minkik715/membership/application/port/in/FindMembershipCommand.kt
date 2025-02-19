package io.github.minkik715.membership.application.port.`in`

import io.github.minkik715.common.SelfValidating

data class FindMembershipCommand(
    val membershipId: Long
): SelfValidating<FindMembershipCommand>() {
    init {
        super.validateSelf()
    }
}