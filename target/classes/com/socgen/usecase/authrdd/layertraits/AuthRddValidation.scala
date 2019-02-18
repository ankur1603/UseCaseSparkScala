package com.socgen.usecase.authrdd.layertraits

import org.apache.spark.rdd.RDD

import com.socgen.usecase.abstractdomain.AbstractAuthRddDomain
import com.socgen.usecase.model.AuthRdd

trait AuthRddValidation extends AbstractAuthRddDomain  {
  abstract override def getResult():RDD[AuthRdd]={
    val authRdd=super.getResult();
    val validatedRdd=authRdd.filter(aRdd=>aRdd.aua.trim()!="650000")
    validatedRdd
  }
}