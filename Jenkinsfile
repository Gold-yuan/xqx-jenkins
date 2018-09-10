node {
    try {
        stage('Build') {
       		echo 'Building 234'
            sh 'gradle build'
            echo 'gradle build finish 233'
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
