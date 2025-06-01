def call(){
stage('checkout'){
// checkout scm
  echo "hello universe"
  git branch "main" ,url "https://github.com/aniruddh030502/a2abin"
}
stage('Unit Tests'){
echo "Running unit tests... "
// sh './gradlew test'
}
}
