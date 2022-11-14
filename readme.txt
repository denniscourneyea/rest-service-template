This project is a simple status service which returns minimal information about the running
application. The primary purpose of the application is to serve as a template or starter project
for web services built using Spring MVC and JSON.

Requirements:

* Java JDK 1.8 or newer
* git version control system


    TODO
    ----
* Revisit Git Flow, Docker, and Jenkins integrations (see history of this file for details)
* Consider alternatives to the abandoned jgitflow-maven-plugin plugin
    * https://gitlab.com/oyvindwe/jgit-flow
    * https://github.com/aleksandr-m/gitflow-maven-plugin
    * https://github.com/egineering-llc/gitflow-helper-maven-plugin
    * https://plugins.jenkins.io/gitflow
    * https://wcm-io.atlassian.net/wiki/spaces/WCMIO/pages/1615134721/How+to+migrate+from+jgitflow-maven-plugin+to+gitflow-maven-plugin
* Use Open API to to create a contract first service specification
* Add more elements to status response, for example:
    * Memory utilization (ideally peak value or a utilization graph)
    * CPU utilization (ideally peak value or a utilization graph)
    * Uptime
* Add automated integration tests
* Implement client library
