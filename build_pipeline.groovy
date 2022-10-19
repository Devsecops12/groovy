buildPipelineView('DSL_Pipeline') {
    filterBuildQueue()
    filterExecutors()
    title('DSL_Pipeline')
    displayedBuilds(4)
    selectedJob('pipe1')
    alwaysAllowManualTrigger()
    showPipelineParameters()
    refreshFrequency(60)
}
