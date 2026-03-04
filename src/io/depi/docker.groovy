package io.depi;

def build(IMAGE_NAME, IMAGE_TAG){
sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG}  ."

}
def push (IMAGE_NAME, IMAGE_TAG){
sh "docker push  ${IMAGE_NAME}:${IMAGE_TAG}  "
}
def login_docker (DOCKER_USERNAME, DOCKER_PASS){
sh "docker login -u  ${DOCKER_USERNAME} -p ${DOCKER_PASS}  "
}