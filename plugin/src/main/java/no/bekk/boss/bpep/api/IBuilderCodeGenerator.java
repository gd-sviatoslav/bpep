package no.bekk.boss.bpep.api;

import java.util.List;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;

public interface IBuilderCodeGenerator {

    void generate(ICompilationUnit compilationUnit, List<IField> selectedFields);

}
