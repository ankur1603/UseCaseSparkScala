package com.socgen.usecase.auth.layertraits

import org.apache.spark.sql.Dataset
import com.socgen.usecase.domain.AuthDomain
import com.socgen.usecase.model.Auth
import com.socgen.usecase.abstractdomain.AbstractAuthDomain
import com.socgen.usecase.utility.UseCaseUtilities
import com.socgen.usecase.utility.UseCaseUtilities.spark

trait AuthEnrichment extends AbstractAuthDomain {
  abstract override def getResult():Dataset[Auth]={
    val authDs=super.getResult();
    import spark.implicits._
    authDs.map(auth=> if(auth.sa=="SERVICEMON") {Auth(auth.aua,auth.aua,auth.asa,auth.res_state_name) }else {auth} )
  }
}