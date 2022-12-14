package ec.com.todocompu.ShrimpSoftUtils.sri.util;

import java.io.Writer;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.Autorizacion;
import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.Mensaje;
import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.RespuestaComprobante;
import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.RespuestaLote;

public class XStreamUtil {

	public static XStream getLoteXStream() {
		XStream xstream = new XStream(new XppDriver() {

			public HierarchicalStreamWriter createWriter(Writer out) {
				return new PrettyPrintWriter(out) {

					protected void writeText(QuickWriter writer, String text) {
						writer.write(text);
					}
				};
			}
		});
		xstream.alias("lote", LoteXml.class);
		xstream.alias("comprobante", ComprobanteXml.class);

		xstream.registerConverter(new ComprobanteXmlConverter());

		return xstream;
	}

	public static XStream getRespuestaXStream() {
		XStream xstream = new XStream(new XppDriver() {

			public HierarchicalStreamWriter createWriter(Writer out) {
				return new PrettyPrintWriter(out) {

					protected void writeText(QuickWriter writer, String text) {
						writer.write(text);
					}
				};
			}
		});
		xstream.alias("respuesta", RespuestaComprobante.class);
		xstream.alias("autorizacion", Autorizacion.class);
		xstream.alias("fechaAutorizacion", XMLGregorianCalendarImpl.class);
		xstream.alias("mensaje", Mensaje.class);
		xstream.registerConverter(new RespuestaDateConverter());

		return xstream;
	}

	public static XStream getRespuestaLoteXStream() {
		XStream xstream = new XStream(new XppDriver() {

			public HierarchicalStreamWriter createWriter(Writer out) {
				return new PrettyPrintWriter(out) {

					protected void writeText(QuickWriter writer, String text) {
						writer.write(text);
					}
				};
			}
		});
		xstream.alias("respuesta", RespuestaLote.class);
		xstream.alias("autorizacion", Autorizacion.class);
		xstream.alias("fechaAutorizacion", XMLGregorianCalendarImpl.class);
		xstream.alias("mensaje", Mensaje.class);
		xstream.registerConverter(new RespuestaDateConverter());

		return xstream;
	}
}
