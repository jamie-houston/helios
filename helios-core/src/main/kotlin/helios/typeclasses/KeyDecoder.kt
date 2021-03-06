package helios.typeclasses

import arrow.core.Either
import arrow.higherkind
import helios.core.DecodingError
import helios.core.JsString

@higherkind
interface KeyDecoder<out A> {
  fun keyDecode(value: JsString): Either<DecodingError, A>
}