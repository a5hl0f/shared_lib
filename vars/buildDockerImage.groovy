def call (){
    sh """
    docker image build -t aquib123/sprinp .
    docker image tag aquib123/sprinp:v1
    docker image tag aquib123/sprinp:latest
    
    """
}