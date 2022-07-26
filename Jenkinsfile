node('master') {
    timestamps {
        ansiColor('xterm') {
            withEnv(['PROD_AUTHORIZED_USERS=welcome']) {
                stage('Checkout') {
                    print '******************** Checkout ******************************'
                    checkout scm
                    ls -ltr
                }     
            }
        }
    }
}