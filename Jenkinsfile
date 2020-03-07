pipeline {
  agent {
    node {
      label 'fstest'
    }

  }
  stages {
    stage('clone') {
      steps {
        git(url: 'https://github.com/ahussain-gith/springboot-fstest.git', branch: 'master')
      }
    }

  }
}