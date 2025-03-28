<meta-runner name="Build">
  <description>1</description>
  <settings>
    <parameters>
      <param name="maven.goals" value="%teamcity.build.branch.is_default% ? &quot;deploy&quot; : &quot;test&quot;" />
    </parameters>
    <build-runners>
      <runner name="" type="Maven2">
        <parameters>
          <param name="goals" value="clean %maven.goals%" />
          <param name="localRepoScope" value="agent" />
          <param name="maven.path" value="%teamcity.tool.maven.DEFAULT%" />
          <param name="pomLocation" value="pom.xml" />
          <param name="runnerArgs" value="-Dmaven.test.failure.ignore=true" />
          <param name="teamcity.step.mode" value="default" />
          <param name="userSettingsSelection" value="settings.xml" />
        </parameters>
      </runner>
    </build-runners>
    <requirements />
  </settings>
</meta-runner>
  #
