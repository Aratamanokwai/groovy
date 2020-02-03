// Ver.0.01
pipeline {
    agent any
    stages {
        stage ('cpu') {
            // 中央演算裝置の處理性能に關する試驗
            steps {
                sh '''
                    sysbench --test=cpu run > cpu_info.txt
                '''
            } // steps {
        } // stage ('cpu') {
        stage ('fileio') {
            // 電子書類入出力性能に關する試驗
            steps {
                sh '''
                    sysbench --test=fileio run > fileio_info.txt
                '''
            } // steps {
        } // stage ('fileio') {
        stage ('memory') {
            // 記憶装置性能に關する試驗
            steps {
                sh '''
                    sysbench --test=memory run > memory_info.txt
                '''
            } // steps {
        } // stage ('memory') {
        stage ('threads') {
            // 動作斷片の處理性能に關する試驗
            steps {
                sh '''
                    sysbench --test=threads run > threads_info.txt
                '''
            } // steps {
        } // stage ('threads') {
        stage ('mutex') {
            // Mutex處理に關する試驗
            steps {
                sh '''
                    sysbench --test=mutex run > mutex_info.txt
                '''
            } // steps {
        } // stage ('mutex') {
    } // stages {
    post {
        always {
            archiveArtifacts artifacts: '*.txt', fingerprint: true
            cleanWs ()
        } // post {
    } // post {
} // pipeline {
