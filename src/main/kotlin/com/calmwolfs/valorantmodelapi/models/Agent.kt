package com.calmwolfs.valorantmodelapi.models

data class Agent(
    val uuid: String,
    val displayName: String,
    val description: String,
    val developerName: String,
    val characterTags: List<String>?,
    val displayIcon: String,
    val bustPortrait: String,
    val fullPortrait: String,
    val assetPath: String,
    val isFullPortraitRightFacing: Boolean,
    val isPlayableCharacter: Boolean,
    val isAvailableForTest: Boolean,
    val role: AgentRole?,
    val abilities: List<AgentAbility>,
)

data class AgentAbility(
    val slot: String,
    val displayName: String?,
    val description: String?,
    val displayIcon: String?,
)

data class AgentRole(
    val uuid: String,
    val displayName: String,
    val description: String,
    val displayIcon: String,
    val assetPath: String,
)