package no.bekk.boss.bpep;

import java.util.List;
import no.bekk.boss.bpep.api.IBuilderCodeGenerator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class MockGenerator implements IBuilderCodeGenerator {

    public void generate(ICompilationUnit compilationUnit, IType enclosingType, List<IField> selectedFields) {
        try {
            System.out.println(compilationUnit.getSource());
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

}
