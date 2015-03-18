package se.thinkcode;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DemoPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getExtensions().create("demoSetting", DemoPluginExtension.class);
        project.getTasks().create("demo", DemoTask.class);
    }
}
