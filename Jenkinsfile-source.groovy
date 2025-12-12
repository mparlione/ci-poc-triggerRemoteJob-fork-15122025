//env.SHARED_LIB_TAG should be injected from (Folder) environment properties
env.SHARED_LIB_TAG="main"
library identifier: "ci-shared-library@${env.SHARED_LIB_TAG}", retriever: modernSCM(
        [$class: 'GitSCMSource',
         remote: 'https://github.com/cb-ci-templates/ci-poc-triggerRemoteJob.git'])


pipeline {
    agent none
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                triggerRemoteJob remotePathMissing: stopAsFailure(), remotePathUrl: getTargetInstanceID("target","child")                //build 'child'
            }
        }
    }
}


