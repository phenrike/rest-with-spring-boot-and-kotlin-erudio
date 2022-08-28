package br.com.erudio.exceptions

import java.lang.*
import kotlin.RuntimeException

class UnsupportedMathOperationException(ex: String?) : RuntimeException(ex)