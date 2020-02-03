// Ver.0.01
pipeline {
    agent any
    stages {
        stage ('DoxyGen') {
            steps {
                sh '''
                    cd "/home/ozawa3/GitHub/py3"
                    pwd
                    sudo doxygen
                '''
            } // steps {
        } // stage ('upgrade') {
    } // stages {
} // pipeline {
