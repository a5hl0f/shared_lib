def call (Map stageParams){
    checkout([
            $class:'GitSCM',
            Branches:[[name: stageParams.branch]],
            userRemoteConfigs:[[url:stageParams.url]]
    ])
}