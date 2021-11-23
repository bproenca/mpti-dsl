/**
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.generator;

import br.edu.ufrn.myhtml.htmlModel.BasicColors;
import br.edu.ufrn.myhtml.htmlModel.MyHtmlModel;
import br.edu.ufrn.myhtml.htmlModel.Paragraph;
import br.edu.ufrn.myhtml.htmlModel.References;
import br.edu.ufrn.myhtml.htmlModel.Row;
import br.edu.ufrn.myhtml.htmlModel.Section;
import br.edu.ufrn.myhtml.htmlModel.Table;
import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class HtmlModelGenerator extends AbstractGenerator {
  private String filename;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    URI _uRI = resource.getURI();
    int _segmentCount = resource.getURI().segmentCount();
    int _minus = (_segmentCount - 1);
    this.filename = _uRI.segment(_minus).replace("myhtml", "html");
    System.out.println((">>" + this.filename));
    final Function1<MyHtmlModel, CharSequence> _function = (MyHtmlModel it) -> {
      return this.compile(it);
    };
    fsa.generateFile(this.filename, 
      IteratorExtensions.join(IteratorExtensions.<MyHtmlModel, CharSequence>map(Iterators.<MyHtmlModel>filter(resource.getAllContents(), MyHtmlModel.class), _function), ", "));
  }
  
  private CharSequence compile(final MyHtmlModel html) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>My Web Page</title>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<body>");
    _builder.newLine();
    {
      EList<Section> _sections = html.getArticle().getSections();
      for(final Section s : _sections) {
        CharSequence _compile = this.compile(s);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      References _references = html.getArticle().getReferences();
      boolean _tripleNotEquals = (_references != null);
      if (_tripleNotEquals) {
        CharSequence _compile_1 = this.compile(html.getArticle().getReferences());
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compile(final Section s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = s.getSize();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("<h");
        int _size_1 = s.getSize();
        _builder.append(_size_1);
        _builder.append("> ");
        String _title = s.getTitle();
        _builder.append(_title);
        _builder.append(" </h");
        int _size_2 = s.getSize();
        _builder.append(_size_2);
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<h1> ");
        String _title_1 = s.getTitle();
        _builder.append(_title_1);
        _builder.append(" </h1>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Paragraph> _paragraphs = s.getParagraphs();
      for(final Paragraph p : _paragraphs) {
        CharSequence _compile = this.compile(p);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Table> _tables = s.getTables();
      for(final Table t : _tables) {
        _builder.append("        ");
        CharSequence _compile_1 = this.compile(t);
        _builder.append(_compile_1, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence compile(final Paragraph p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p style=\"color: ");
    BasicColors _color = p.getColor();
    _builder.append(_color);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    String _content = p.getContent();
    _builder.append(_content);
    _builder.newLineIfNotEmpty();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compile(final Table t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table style=\"width:100%\" border=\"1px\">");
    _builder.newLine();
    _builder.append("<tr style=\"background-color:lightgray\">");
    _builder.newLine();
    {
      EList<String> _tableHeaderData = t.getHeader().getTableHeaderData();
      for(final String dataHeader : _tableHeaderData) {
        _builder.append("<th style=\"background-color:darkgray\">");
        _builder.append(dataHeader);
        _builder.append("</th>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</tr>");
    _builder.newLine();
    {
      EList<Row> _rows = t.getRows();
      for(final Row row : _rows) {
        _builder.append("<tr>");
        _builder.newLine();
        {
          EList<String> _tableRowData = row.getTableRowData();
          for(final String dataRow : _tableRowData) {
            _builder.append("    ");
            _builder.append("<th>");
            _builder.append(dataRow, "    ");
            _builder.append("</th>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compile(final References r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h1>References:</h1>");
    _builder.newLine();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<String> _links = r.getLinks();
      for(final String l : _links) {
        _builder.append("<li><a href=https://");
        _builder.append(l);
        _builder.append(">");
        _builder.append(l);
        _builder.append("</a></li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
}
