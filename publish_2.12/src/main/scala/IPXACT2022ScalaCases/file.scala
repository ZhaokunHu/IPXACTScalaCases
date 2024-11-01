// Generated by <a href="http://IPXACT2022scalaxb.org/">IPXACT2022scalaxb</a>.
package IPXACT2022ScalaCases

case class IsIncludeFile(value: Boolean,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val externalDeclarations = attributes("@externalDeclarations").as[Boolean]
}

      
      


case class LogicalName(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val default = attributes("@default").as[Boolean]
}

      
      


case class ExportedName(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Flags(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends StringExpressionable {
  lazy val append = attributes.get("@append") map { _.as[Boolean]}
}

      
      


case class BuildCommand(command: Option[IPXACT2022ScalaCases.StringExpressionable] = None,
  flags: Option[IPXACT2022ScalaCases.Flags] = None,
  replaceDefaultFlags: Option[IPXACT2022ScalaCases.UnsignedBitExpression] = None,
  targetName: Option[IPXACT2022ScalaCases.IpxactURIable] = None)
      
      


case class ImageType(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class File(name: IPXACT2022ScalaCases.IpxactURIable,
  fileType: Seq[IPXACT2022ScalaCases.FileType] = Nil,
  isStructural: Option[Boolean] = None,
  isIncludeFile: Option[IPXACT2022ScalaCases.IsIncludeFile] = None,
  logicalName: Option[IPXACT2022ScalaCases.LogicalName] = None,
  exportedName: Seq[IPXACT2022ScalaCases.ExportedName] = Nil,
  buildCommand: Option[IPXACT2022ScalaCases.BuildCommand] = None,
  dependency: Seq[IPXACT2022ScalaCases.Dependency] = Nil,
  define: Seq[IPXACT2022ScalaCases.NameValuePairTypable] = Nil,
  imageType: Seq[IPXACT2022ScalaCases.ImageType] = Nil,
  description: Option[String] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val fileId = attributes.get("@fileId") map { _.as[String]}
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class FileBuilder(fileType: IPXACT2022ScalaCases.FileType,
  command: IPXACT2022ScalaCases.StringExpressionable,
  flags: Option[IPXACT2022ScalaCases.StringExpressionable] = None,
  replaceDefaultFlags: Option[IPXACT2022ScalaCases.UnsignedBitExpression] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class LanguageTools(fileBuilder: Seq[IPXACT2022ScalaCases.FileBuilder] = Nil,
  languagetoolssequence1: Option[IPXACT2022ScalaCases.LanguageToolsSequence1] = None)
      
      

case class LanguageToolsSequence2(linkerFlags: IPXACT2022ScalaCases.StringExpressionable,
  linkerCommandFile: Option[IPXACT2022ScalaCases.LinkerCommandFile] = None) extends LanguageToolsOption
      

trait LanguageToolsOption
case class LanguageToolsSequence1(linker: IPXACT2022ScalaCases.StringExpressionable,
  languagetoolsoption: IPXACT2022scalaxb.DataRecord[IPXACT2022ScalaCases.LanguageToolsOption])
      


case class FileSetRefGroup(fileSetRef: Seq[IPXACT2022ScalaCases.FileSetRef] = Nil)
      
      


case class ExecutableImage(nameGroupSequence1: IPXACT2022ScalaCases.NameGroupSequence,
  parameters: Option[IPXACT2022ScalaCases.Parameters] = None,
  languageTools: Option[IPXACT2022ScalaCases.LanguageTools] = None,
  fileSetRefGroup: Option[IPXACT2022ScalaCases.FileSetRefGroup] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val imageId = attributes("@imageId").as[String]
  lazy val imageType = attributes.get("@imageType") map { _.as[String]}
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class LinkerCommandFile(name: IPXACT2022ScalaCases.StringExpressionable,
  commandLineSwitch: IPXACT2022ScalaCases.StringExpressionable,
  enable: IPXACT2022ScalaCases.UnsignedBitExpression,
  generatorRef: Seq[IPXACT2022ScalaCases.GeneratorRef] = Nil,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends LanguageToolsOption {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class FileSetRef(localName: String,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Dependency(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends IpxactURIable {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class FileSets(fileSet: Seq[IPXACT2022ScalaCases.FileSetType] = Nil)
      
      


case class FileBuilderType(fileType: IPXACT2022ScalaCases.FileType,
  command: Option[IPXACT2022ScalaCases.StringExpressionable] = None,
  flags: Option[IPXACT2022ScalaCases.StringExpressionable] = None,
  replaceDefaultFlags: Option[IPXACT2022ScalaCases.UnsignedBitExpression] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      

sealed trait ReturnTypeType

object ReturnTypeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.ReturnTypeType]): ReturnTypeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: ReturnTypeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[ReturnTypeType] = Seq(Void, IntTypeValue)
}

case object Void extends ReturnTypeType { override def toString = "void" }
case object IntTypeValue extends ReturnTypeType { override def toString = "int" }


case class Group2(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Argument(nameGroupStringSequence1: IPXACT2022ScalaCases.NameGroupStringSequence,
  value: IPXACT2022ScalaCases.StringExpressionable,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends NameValuePairTypable {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
  lazy val dataType = attributes("@dataType").as[DataTypeType]
}

      
      


case class SourceFile(sourceName: IPXACT2022ScalaCases.IpxactURIable,
  fileType: IPXACT2022ScalaCases.FileType,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class FunctionType(entryPoint: Option[String] = None,
  fileRef: String,
  returnType: Option[IPXACT2022ScalaCases.ReturnTypeType] = None,
  argument: Seq[IPXACT2022ScalaCases.Argument] = Nil,
  disabled: Option[IPXACT2022ScalaCases.UnsignedBitExpression] = None,
  sourceFile: Seq[IPXACT2022ScalaCases.SourceFile] = Nil,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val replicate = attributes("@replicate").as[Boolean]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class FileSetType(nameGroupSequence1: IPXACT2022ScalaCases.NameGroupSequence,
  group: Seq[IPXACT2022ScalaCases.Group2] = Nil,
  file: Seq[IPXACT2022ScalaCases.File] = Nil,
  defaultFileBuilder: Seq[IPXACT2022ScalaCases.FileBuilderType] = Nil,
  dependency: Seq[IPXACT2022ScalaCases.Dependency] = Nil,
  function: Seq[IPXACT2022ScalaCases.FunctionType] = Nil,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      

sealed trait DataTypeType

object DataTypeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.DataTypeType]): DataTypeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: DataTypeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[DataTypeType] = Seq(IntType, Unsignedint, LongType, Unsignedlong, FloatType, DoubleType, Charu42, Voidu42)
}

case object IntType extends DataTypeType { override def toString = "int" }
case object Unsignedint extends DataTypeType { override def toString = "unsigned int" }
case object LongType extends DataTypeType { override def toString = "long" }
case object Unsignedlong extends DataTypeType { override def toString = "unsigned long" }
case object FloatType extends DataTypeType { override def toString = "float" }
case object DoubleType extends DataTypeType { override def toString = "double" }
case object Charu42 extends DataTypeType { override def toString = "char *" }
case object Voidu42 extends DataTypeType { override def toString = "void *" }


case class GeneratorRef(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      

