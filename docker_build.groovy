def call(Map config) {
    sh "mvn clean package -DskipTests"
    sh "docker build -t ${config.imageName}:${config.tag} ."
}
