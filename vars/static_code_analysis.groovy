def call(Map config) {
    withSonarQubeEnv(config.credentialId) {
        sh "mvn clean package sonar:sonar"
    }
}
