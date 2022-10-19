buildPipelineView('DSL_Pipeline') {
    filterBuildQueue()
    filterExecutors()
    title('DSL_Pipeline')
    displayedBuilds(1)
    selectedJob('seed')
    alwaysAllowManualTrigger()
    showPipelineParameters()
    refreshFrequency(60)
}
