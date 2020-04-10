// Ver.0.01
pipeline {
    agent any
    stages {
        stage ('list-trash') {
            // 中央演算裝置の處理性能に關する試驗
            steps {
                sh '''
                    trash-list > trash_list.txt
                '''
            } // steps {
        } // stage ('list-trash') {
        stage ('del-trash') {
            // 電子書類入出力性能に關する試驗
            steps {
                sh '''
                    trash-empty
                '''
            } // steps {
        } // stage ('del-trash') {
    } // stages {
    post {
        always {
            archiveArtifacts artifacts: '*.txt', fingerprint: true
            cleanWs ()
        } // post {
    } // post {
} // pipeline {
