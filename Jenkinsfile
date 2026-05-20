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
                start cmd /c "for %%i in (target\\*.jar) do java -jar %%i"
                '''
            }
        }
    }
}
