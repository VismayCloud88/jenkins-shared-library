def call(Map config) {
    withCredentials([usernamePassword(credentialsId: config.credentialsId, usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh "echo '${PASS}' | docker login -u '${USER}' --password-stdin"
        sh "docker push ${config.imageName}:${config.tag}"
    }
}
