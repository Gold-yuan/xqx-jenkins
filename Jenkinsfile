node {
    try {
        stage('Build') {
       		echo 'Building'
            sh 'gradle build'
            sh 'pwd'
            echo 'gradle build finish'
        }
        stage('Deploy') {
       		echo 'Deploying'
    	}
    }
    catch (exc) {
        echo 'I failed'
        throw exc
    }
    finally {
        echo 'deploy finish'
    }
}
