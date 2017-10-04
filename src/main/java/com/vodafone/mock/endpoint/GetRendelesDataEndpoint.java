package com.vodafone.mock.endpoint;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.vodafone.mock.model.GetRendelesData;
import com.vodafone.mock.model.GetRendelesDataResponse;
import com.vodafone.mock.model.RealDeliveryTime;
import com.vodafone.mock.model.RendelesAdatok;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Endpoint
public class GetRendelesDataEndpoint extends AbstractEndpoint {

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getRendelesData")
    @ResponsePayload
    public GetRendelesDataResponse getRendelesData(@RequestPayload GetRendelesData request){
        GetRendelesDataResponse response = new GetRendelesDataResponse();

        RealDeliveryTime realDeliveryTime = new RealDeliveryTime();
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        Date date = calendar.toGregorianCalendar().getTime();
        java.lang.String formattedDate  = formatter.format(date);
        realDeliveryTime.setValue(calendar);
        
        RendelesAdatok rendelesAdatok = new RendelesAdatok();
        rendelesAdatok.setCNev("Haász Regina");
        rendelesAdatok.setCSzemely("Haász regina");
        rendelesAdatok.setCIrsz("8000");
        rendelesAdatok.setCHelyseg("Székesfehérvár");
        rendelesAdatok.setCUtca("Kaszap István u.");
        rendelesAdatok.setCVevokod("421-439834");
        rendelesAdatok.setSzamlaszam("0");
        rendelesAdatok.setUtanvetel("7590");
        rendelesAdatok.setDarab(1);
        rendelesAdatok.setSuly("1.7");
        rendelesAdatok.setFeladobetujel("megveheti.hu Webáruház");
        rendelesAdatok.setHelyszin(1);

        response.setRendelesAdatok(rendelesAdatok);
        response.setTipus(1);
        response.setFutarnalBankkartyaFizetes(false);
        response.setAzonnaliSzallitas(false);
        response.setFixIdejuRendeles(null);
        response.setStatus(4);
        response.setRealDeliveryTime(formattedDate);
        return response;
    }
}
