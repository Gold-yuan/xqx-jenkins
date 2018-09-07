pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    pwd
                    ls -lah
                    
                '''
            }
        }
    }
}

node {
    try {
        stage('Build') {
                sh 'echo "Hello World 233"'
        }
    }
    catch (exc) {
        echo 'I failed'
    }
    finally {
        mail to: '515789026@qq.com',
             subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Something is wrong with ${env.BUILD_URL}"
    }
}
