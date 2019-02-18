package com.socgen.usecase.authrdd.layertraits


import org.apache.spark.rdd.RDD
import com.socgen.usecase.abstractdomain.AbstractAuthRddDomain
import com.socgen.usecase.model.AuthRdd

trait AuthRddDataProcess extends AbstractAuthRddDomain {
  abstract override def getResult():RDD[AuthRdd]={
    val authRdd=super.getResult();
    val retRdd=authRdd.filter(auth=>auth.aua==auth.sa)
    retRdd
  }
}