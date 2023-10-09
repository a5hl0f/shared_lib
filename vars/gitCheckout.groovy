def call (Map stageParams){
    checkout([
            userRemoteConfigs:[[url:stageParams.url]]
    ])
}