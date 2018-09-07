node {
    try {
        stage('Build') {
       		echo 'Building'
            gradle build
            pwd
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
