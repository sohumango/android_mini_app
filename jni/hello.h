#ifndef _Included_hello
#define _Included_hello

#include <jni.h>
#define FUNC(x) Java_com_minimal_moduleA_ ## x
#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jstring JNICALL FUNC(getVersion)(JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif