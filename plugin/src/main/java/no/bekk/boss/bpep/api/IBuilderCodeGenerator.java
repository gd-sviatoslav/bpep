package no.bekk.boss.bpep.api;

import java.util.List;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IType;

public interface IBuilderCodeGenerator {

    void generate(ICompilationUnit compilationUnit, IType enclosingType, List<IField> selectedFields);

}
