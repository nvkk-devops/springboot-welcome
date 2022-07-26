node('master') {
    timestamps {
        ansiColor('xterm') {
            withEnv(['PROD_AUTHORIZED_USERS=welcome']) {
                stage('Checkout') {
                    print '******************** Checkout ******************************'
                    checkout scm
                    sh """
                    ls -ltr
                    """
                }
                stage('Compile') {
                    print '******************** Compile ******************************'
                    sh """
                    mvn clean install -Dmaven.test.skip=true
                    """
                } 
                stage('Test') {
                    print '******************** Test ******************************'
                    sh """
                    mvn clean install -Dmaven.test.skip=false
                    """
                }
                stage('Test') {
                    print '******************** Publish ******************************'
                    sh """
                    mvn clean install -Dmaven.test.skip=false
                    """
                }    
            }
        }
    }
}