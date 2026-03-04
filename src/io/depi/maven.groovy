// this class is from this package
package io.depi ; 


def javaBuild(Build_OPT){
  sh "mvn clean package ${Build_OPT}"
}

def javatest(TEST_OPT){
  sh "mvn test ${TEST_OPT}"
}