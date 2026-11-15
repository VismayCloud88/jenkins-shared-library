def call(Map config) {
    timeout(time: 10, unit: 'MINUTES') {
        waitForQualityGate abortPipeline: true, credentialsId: config.credentialId
    }
}
