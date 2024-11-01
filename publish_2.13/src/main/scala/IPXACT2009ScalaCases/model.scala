package IPXACT2009ScalaCases

// Generated by <a href="http://IPXACT2009scalaxb.org/">IPXACT2009scalaxb</a>.


case class Language(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val strict = attributes("@strict").as[Boolean]
}

      
      


case class WhiteboxElementRefs(whiteboxElementRef: Seq[WhiteboxElementRefType] = Nil)
      
      


/** Component view type
*/
case class ViewType(nameGroupNMTOKENSequence1: NameGroupNMTOKENSequence,
  envIdentifier: Seq[String] = Nil,
  viewtypeoption: IPXACT2009scalaxb.DataRecord[ViewTypeOption],
  vendorExtensions: Option[VendorExtensions] = None)
      
      

case class ViewTypeSequence1(language: Option[Language] = None,
  modelName: Option[String] = None,
  defaultFileBuilder: Seq[FileBuilderType] = Nil,
  fileSetRef: Seq[FileSetRef] = Nil,
  constraintSetRef: Seq[String] = Nil,
  whiteboxElementRefs: Option[WhiteboxElementRefs] = None,
  parameters: Option[Parameters] = None) extends ViewTypeOption
      

trait ViewTypeOption

case class Language2(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val strict = attributes.get("@strict") map { _.as[Boolean]}
}

      
      


/** Abstraction view type
*/
case class AbstractorViewType(nameGroupNMTOKENSequence1: NameGroupNMTOKENSequence,
  envIdentifier: Seq[String] = Nil,
  language: Option[Language2] = None,
  modelName: Option[String] = None,
  defaultFileBuilder: Seq[FileBuilderType] = Nil,
  fileSetRef: Seq[FileSetRef] = Nil,
  parameters: Option[Parameters] = None,
  vendorExtensions: Option[VendorExtensions] = None)
      
      


case class Views(view: Seq[ViewType] = Nil)
      
      


case class Ports(port: Seq[PortTypable] = Nil)
      
      


case class ModelParameters(modelParameter: Seq[NameValueTypeType] = Nil)
      
      


/** Model information.
			
*/
case class ModelType(views: Option[Views] = None,
  ports: Option[Ports] = None,
  modelParameters: Option[ModelParameters] = None)
      
      


case class Views2(view: Seq[AbstractorViewType] = Nil)
      
      


case class Ports2(port: Seq[AbstractorPortType] = Nil)
      
      


case class ModelParameters2(modelParameter: Seq[NameValueTypeType] = Nil)
      
      


/** Model information for an abstractor.
*/
case class AbstractorModelType(views: Option[Views2] = None,
  ports: Option[Ports2] = None,
  modelParameters: Option[ModelParameters2] = None)
      
      


case class WhiteboxPath(pathName: String,
  whiteboxpathsequence1: Option[WhiteboxPathSequence1] = None)
      
      

case class WhiteboxPathSequence1(left: BigInt,
  right: BigInt)
      


/**  Reference to a whiteboxElement within a view. The 'name' attribute must refer to a whiteboxElement defined within this component.  
*/
case class WhiteboxElementRefType(whiteboxPath: Seq[WhiteboxPath] = Nil,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val name = attributes("@name").as[String]
}

      
      

