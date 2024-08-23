package archtecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import org.junit.jupiter.api.Test;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = {"archtecture", "problemSolving.algorithms"})
public class ConventionArchTest {

    @Test
    void classesMustBeEndingWithAlgorithm(){
        JavaClasses classes = new ClassFileImporter()
                .importPackages("problemSolving.algorithms"); // Importe o pacote correto

        ArchRule rule = classes()
                .that().resideInAPackage("problemSolving.algorithms")
                .should().haveSimpleNameEndingWith("Algorithm");

        rule.check(classes);
    }


}