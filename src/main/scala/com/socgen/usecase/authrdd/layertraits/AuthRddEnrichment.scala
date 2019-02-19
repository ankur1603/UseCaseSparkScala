package com.socgen.usecase.authrdd.layertraits

import org.apache.spark.rdd.RDD
import com.socgen.usecase.abstractdomain.AbstractAuthRddDomain
import com.socgen.usecase.model.AuthRdd

trait AuthRddEnrichment extends AbstractAuthRddDomain {
  abstract override def getResult():RDD[AuthRdd]={
    val authRdd=super.getResult();
    val retRdd=authRdd.map(aRdd=> if(aRdd.sa=="SERVICEMON") {AuthRdd(aRdd.aua,aRdd.aua,aRdd.asa,aRdd.res_state_name) }else {aRdd} )
    retRdd
  }
}