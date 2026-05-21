pipeline {

    agent any

    tools {
        jdk 'Java21'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvnw.cmd clean install'
            }
        }

        stage('Stop Old Application') {
            steps {
                bat '''
                taskkill /F /IM java.exe || exit /B 0
                '''
            }
        }
        stage('Run Application') {
            steps {
                bat '''
                powershell -Command "Start-Process java -ArgumentList '-jar target\\SRBank-0.0.1-SNAPSHOT.jar'"
                '''
            }
        }
    }
}
