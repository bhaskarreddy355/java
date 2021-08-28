trigger:
- main
pool:
  vmImage: ubuntu-latest
steps:
- task: CmdLine@2
  inputs:
        script: |
          javac Sum.java
          
          java Sum