![Diagram.png](Diagram.png)


Links

* https://docs.cloudbees.com/docs/cloudbees-ci-kb/latest/client-and-managed-controllers/trigger-jobs-across-controllers
* https://docs.cloudbees.com/docs/cloudbees-ci/latest/secure/authentication-mapping
* https://docs.cloudbees.com/docs/cloudbees-ci/latest/secure/authentication-mapping#_change_the_authentication_mapping_strategy
* https://docs.cloudbees.com/docs/cloudbees-ci/latest/cloud-admin-guide/trigger-restrictions

* Authentication mapping must be "trusted controllers" SYSTEM <-> SYSTEM Mapping https://docs.cloudbees.com/docs/cloudbees-ci-kb/latest/client-and-managed-controllers/trigger-jobs-across-controllers
* The controllers must be re-provisioned after authentication mappings on the Operations Center. Documentation says "reconnect," but it must be re-provisioning https://docs.cloudbees.com/docs/cloudbees-ci/latest/secure/authentication-mapping#_change_the_authentication_mapping_strategy
 