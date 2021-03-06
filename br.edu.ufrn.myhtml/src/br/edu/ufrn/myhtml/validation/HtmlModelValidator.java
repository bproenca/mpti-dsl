/*
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.validation;

import org.eclipse.xtext.validation.Check;

import br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage;
import br.edu.ufrn.myhtml.htmlModel.References;
import br.edu.ufrn.myhtml.htmlModel.Row;
import br.edu.ufrn.myhtml.htmlModel.Section;
import br.edu.ufrn.myhtml.htmlModel.Table;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class HtmlModelValidator extends AbstractHtmlModelValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checksectionStartsWithCapital(Section section) {
		if (!Character.isUpperCase(section.getTitle().charAt(0))) {
			warning("Nome deve come?ar com letra mai?scula",
					HtmlModelPackage.Literals.SECTION__TITLE, INVALID_NAME);
		}
	}
	
	@Check
	public void checkReferenceIsUnique(References refs) {
		for (int i = 0; i < refs.getLinks().size(); i++) {
			for (int j = i + 1; j < refs.getLinks().size(); j++) {
				if (refs.getLinks().get(i).equalsIgnoreCase(refs.getLinks().get(j))) {
					error("Refer?ncias devem ser ?nicas", HtmlModelPackage.Literals.REFERENCES__LINKS);
				}
			}
		}
	}
	
	@Check
	public void checkNumberColumns(Table table) {
		int headerColNumber = table.getHeader().getTableHeaderData().size();
		for (Row row : table.getRows()) {
			if (row.getTableRowData().size() != headerColNumber) {
				warning("Quantidade de colunas devem ser iguais", HtmlModelPackage.Literals.TABLE__HEADER);		
			}
		}
	}
	
}
