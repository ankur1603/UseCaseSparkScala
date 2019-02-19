package com.socgen.usecase.abstractdomain

import org.apache.spark.rdd.RDD
import com.socgen.usecase.model.AuthRdd

abstract class AbstractAuthRddDomain extends AbstractDomain[RDD,AuthRdd] {
  def getResult():RDD[AuthRdd]
}