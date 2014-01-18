package com.pengttyy.annations.study.annotate;
@Xml(nodeName = "Root",isRoot = true)
public class CreateXML {
  @Xml(nodeName = "groupId")
  private String groupId;
  
  @Xml(nodeName = "artifactId")
  private String artifactId;
  
  @Xml(nodeName = "packaging")
  private String packaging;
}
