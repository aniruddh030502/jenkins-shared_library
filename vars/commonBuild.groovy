def call(){
stage('checkout'){
checkout scm
}
stage('Unit Tests'){
echo "Running unit tests... "
sh './gradlew test'
}
}
