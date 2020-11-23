package com.example.jpconverter;
 
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator; 
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;
import com.sun.codemodel.JCodeModel;

public class Boot {

  public static void main(String[] args) {
    try {
      JCodeModel codeModel = new JCodeModel();
      URL source = new File("person.json").toURI().toURL();
      GenerationConfig config = new DefaultGenerationConfig() {
        @Override
        public boolean isGenerateBuilders() { 
          return true;
        }
      };
      SchemaMapper mapper = new SchemaMapper(
          new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()),
          new SchemaGenerator());
      mapper.generate(codeModel, "Person", "com.example", source);
      new File("output").mkdir();
      codeModel.build(new File("output"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
